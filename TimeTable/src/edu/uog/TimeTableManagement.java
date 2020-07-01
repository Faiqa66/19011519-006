package edu.uog;

import java.util.List;

import com.uog.timetable.TimeSlot;
import com.uog.timetable.TimeSlotData;
import com.uog.timetable.Timetable;
import com.uog.timetable.TimetableData;
import com.uog.timetable.WeekDay;
import com.uog.timetable.WeekDayData;

import edu.uog.Campus.Room;
import edu.uog.Campus.RoomData;
import edu.uog.Course.Course;
import edu.uog.Course.CourseData;
import edu.uog.Person.Person;
import edu.uog.Person.PersonData;
import edu.uog.Student.Student;
import edu.uog.Student.StudentCourse;
import edu.uog.Student.StudentCourseData;
import edu.uog.Student.StudentData;
import edu.uog.Teacher.Teacher;
import edu.uog.Teacher.TeacherCourse;
import edu.uog.Teacher.TeacherCourseData;
import edu.uog.Teacher.TeacherData;

public class TimeTableManagement {

	@SuppressWarnings("unused")
//	public static void main(String[] args) {
		
		
		
		System.out.println("==============================");
		System.out.println("\n\t\tRoom Data\t\t\n");
		System.out.println("==============================");
		RoomData roomdata=new RoomData();
		
		System.out.println("\t\tFind One\t\t");
		Room room=RoomData.findOne(1);
		System.out.println(room.toString());
		
		System.out.println("\n\t\tFind All\t\t");
		
		List<Room> rooms=RoomData.findAll();
		for(int i=0;i<rooms.size();i++) {
			
			System.out.println(rooms.get(i).toString());
		}	
			System.out.println("\t\tSearch\t\t\n");
			
			rooms=RoomData.search("CR-");
			for(int i=0;i<rooms.size();i++) {
				System.out.println(rooms.get(i).toString());
			}
			
			System.out.println("\t\tSave\t\t\n");
			room.setROOM_ID(5);
			room.setROOM_NAME("CR-05");
			room.setROOM_FLOOR(2);
			room.setROOM_CAPACITY(60);
			room.setROOM_TYPE("Class Room");
			room=RoomData.Save(room);
			System.out.println(room.toString());
			
		
		
		System.out.println("================================");
		System.out.println("\t\tCourse Data\t\t\n");
		System.out.println("===============================");
		CourseData coursedata=new CourseData();
		
		System.out.println("\t\tFind One\t\t");
		Course course=CourseData.findOne(1);
		System.out.println(course.toString());
		
		System.out.println("\n\t\tFind All\t\t\n");
		
		List<Course> courses=CourseData.findAll();
		for(int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i).toString());
			
		}
		
		System.out.println("\t\tSearch\t\t\n");
		
		courses=CourseData.search("CS-");
		for(int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i).toString());
		}
		
		System.out.println("\t\tSave\t\t\n");
		course.setCOURSE_ID(1);
		course.setCOURSE_TITLE("Programming Fundamental");
		course.setCOURSE_CODE("CS-102");
		course.setCOURSE_DESC("PF");
		course.setCREDITHOUR(4);
		course=CourseData.Save(course);
		System.out.println(course.toString());
		
		System.out.println("\t\tDelete Data\t\t\n");
		course=CourseData.DelOne(1);
		System.out.println(course);
		
		System.out.println("===============================");
		System.out.println("\n\t\tTeacher Data\t\t\n");
		System.out.println("===============================");
		
		TeacherData teacherData=new TeacherData();
		System.out.println("\t\tFind One\t\t");
		Teacher teacher=TeacherData.findOne(1);
		System.out.println(teacher.toString());
		
		System.out.println("\n\t\tFind All\t\t");
		List<Teacher> tc=TeacherData.findAll();
		
		for(int i=0;i<tc.size();i++) {
			System.out.println(tc.get(i).toString());
		}
		
		System.out.println("\n\t\tSearch\t\t\n");
		
		tc=TeacherData.search("Dr.");
		for(int i=0;i<tc.size();i++) {
			System.out.println(tc.get(i).toString());
		}
		
		System.out.println("\t\tSave\t\t\n");
		teacher.setTEACHER_ID(1);
		teacher.setTEACHER_NAME("Dr.Nauman Riaz");
		teacher=TeacherData.Save(teacher);
		System.out.println(teacher.toString());
		
		System.out.println("\t\tDelete Data\t\t\n");
		teacher=TeacherData.DelOne(1);
		System.out.println(teacher);
		
		
		System.out.println("===================================");
		System.out.println("\t\tTeacher Course Data\t\t\n");
		System.out.println("====================================");
		
		TeacherCourseData teacherData1=new TeacherCourseData();
		
		System.out.println("\t\tFind One\t\t\n");
		TeacherCourse teacher1=TeacherCourseData.findOne(1);
		System.out.println(teacher1.toString());
		
		
		System.out.println("\t\tFind All\t\t\n");
		List<TeacherCourse> tCourse=TeacherCourseData.findAll();
		for(int i=0;i<tCourse.size();i++) {
			System.out.println(tCourse.get(i).toString());
		}
		
		System.out.println("\t\tSearch\t\t\n");
		tCourse=TeacherCourseData.search("1");
		for(int i=0;i<tc.size();i++) {
			System.out.println(tc.get(i).toString());
		}
		
		System.out.println("\t\tSave\t\t\n");
		teacher1.setTEACHERCOURSE_ID(1);
		teacher1.setTEACHER_ID(TeacherData.findOne(1));
		teacher1.setCOURSE_ID(CourseData.findOne(1));
		teacher1.setSECTION("A");
		
		teacher1=TeacherCourseData.Save(teacher1);
		System.out.println(teacher1.toString());
		
		System.out.println("\t\tDelete Data\t\t\n");
		teacher1=TeacherCourseData.DelOne(1);
		System.out.println(teacher1);
		
		System.out.println("=====================================");
		System.out.println("\n\t\tPerson Data\t\t");
		System.out.println("=====================================");
		PersonData personData=new PersonData();
		
		System.out.println("\n\t\tFind One\t\t");
		
		Person person=PersonData.findOne(1);
		System.out.println(person.toString());
		
		System.out.println("\n\t\tFind All\t\t");
		
		List<Person> pr=PersonData.findAll();
		for(int i=0;i<pr.size();i++) {
			System.out.println(pr.get(i).toString());
		}
		
        System.out.println("\n\t\tSearch\t\t\n");
		
		pr=PersonData.search("18");
		for(int i=0;i<pr.size();i++) {
			System.out.println(pr.get(i).toString());
		}
		
		System.out.println("\t\tSave\t\t\n");
		
		person.setPERSON_ID(1);
		person.setFORE_NAME("Faiqa");
		person.setSUR_NAME("Shabbir");
		person.setADDRESS("Mandi");
		person.setGENDER("Female");
		person.setTITLE("Student");
		person.setAGE(18);
		
		person=PersonData.Save(person);
		System.out.println(person.toString());
		
		System.out.println("\t\tDelete Data\t\t\n");

        person=PersonData.DelOne(1);
        System.out.println(person.toString());
        
		
		System.out.println("==============================");
		System.out.println("\n\t\tStudent Data\t\t");
        System.out.println("==============================");
		StudentData studentData=new StudentData();
		
		System.out.println("\n\t\tFind One\t\t");
		Student student=StudentData.findOne(1);
		System.out.println(student.toString());
		
		System.out.println("\n\t\tFind All\t\t");
		List<Student> st=StudentData.findAll();
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i).toString());
		}
		
		 System.out.println("\n\t\tSearch\t\t\n");
			
			st=StudentData.search("2");
			for(int i=0;i<st.size();i++) {
				System.out.println(st.get(i).toString());
			}
			
			System.out.println("\t\tSave\t\t\n");
			
			student.setSTUDENT_ID(1);
			student.setSTUDENT_ROLLNO("19011519-001");
			student.setSTUDY_PROGRAM("BS");
			student.setSTUDY_YEAR("2019");
			
			student=StudentData.Save(student);
			System.out.println(student.toString());
		
			System.out.println("\t\tDelete Data");
			student=StudentData.DelOne(1);
			System.out.println(student);
			
			System.out.println("=============================");
			System.out.println("\n\t\tStudent Course Data\t\t");
			System.out.println("=============================");
			StudentCourseData scData=new StudentCourseData();
			Course course1=new Course();
			Student student1=new Student();
			
			
			System.out.println("\n\t\tFind One\t\t\n");
			StudentCourse stc=StudentCourseData.findOne(1);
			System.out.println(stc.toString());
			
			System.out.println("\t\tFind All\t\t\n");
			
			List<StudentCourse> sdata=StudentCourseData.findAll();
			for(int i=0;i<sdata.size();i++) {
				System.out.println(sdata.get(i).toString());
			}
			
			 System.out.println("\n\t\tSearch\t\t\n");
				sdata=StudentCourseData.search("1");
				for(int i=0;i<sdata.size();i++) {
					System.out.println(sdata.get(i).toString());
				}
				
				System.out.println("\t\tSave\t\t\n");
				stc.setSTUDENTCOURSE_ID("CS-103");
				course1=CourseData.findOne(1);
				student1=StudentData.findOne(1);
				stc.setSECTION("A");
				
				stc=StudentCourseData.Save(stc);
				System.out.println(stc.toString());
				
				System.out.println("\t\tDelete Data\t\t\n");
				stc=StudentCourseData.DelOne(1);
				System.out.println(stc);
				
      System.out.println("===============================");
      System.out.println("\n\t\tTime Table\t\t\n");
      System.out.println("==================================");
      
      TimetableData tdata=new TimetableData();
		
		System.out.println("\n\t\tFind One\t\t");
		
		Timetable time=TimetableData.findOne(1);
		System.out.println(time.toString());
		
		System.out.println("\n\t\tFind All\t\t\n");
		
		List<Timetable> timet=TimetableData.findAll();
		for(int i=0;i<timet.size();i++) {
			System.out.println(timet.get(i).toString());
			
		}
		
		System.out.println("\t\tSearch\t\t\n");
		
		timet=TimetableData.search("1");
		for(int i=0;i<timet.size();i++) {
			System.out.println(timet.get(i).toString());
		}
		
		System.out.println("\t\tSave\t\t\n");
		time.setTIMETABLE_ID(1);
		time.setROOM_ID(room);
		time.setTEACHERCOURSE_ID(teacher1);
		time.setTIMESLOT_ID(TimeSlotData.findOne(1));
		time=TimetableData.Save(time);
		System.out.println(time.toString());
	  
		System.out.println("\t\tDel One\t\t\n");
		
		
		System.out.println("\t\tDel One\t\t\n");
		time=TimetableData.DelOne(1);
		System.out.println(time);
		
		
		System.out.println("=================================");
		System.out.println("\n\t\tTime Slot\t\t");
		System.out.println("=================================");
        
        TimeSlotData timedata=new TimeSlotData();
		
		System.out.println("\t\tFind One\t\t");
		TimeSlot timeSlot=TimeSlotData.findOne(1);
		System.out.println(timeSlot.toString());
		
		System.out.println("\n\t\tFind All\t\t\n");
		
		List<TimeSlot> timeslot=TimeSlotData.findAll();
		for(int i=0;i<timeslot.size();i++) {
			System.out.println(timeslot.get(i).toString());
			
		}
		
		System.out.println("\t\tSearch\t\t\n");
		
		timeslot=TimeSlotData.search("6");
		for(int i=0;i<timeslot.size();i++) {
			System.out.println(timeslot.get(i).toString());
		}
		
		System.out.println("\t\tSave\t\t\n");
	    timeSlot.setTIMESLOT_ID(1);
	    timeSlot.setWeekDay_ID(WeekDayData.findOne(1));
	    timeSlot.setTIMESLOT_START("8:45");
	    timeSlot.setTIMESLOT_END("10:15");
		
		
		timeSlot=TimeSlotData.Save(timeSlot);
		System.out.println(timeSlot.toString());
		
	    System.out.println("===========================");
	    System.out.println("\n\t\tWeek Day\t\t");
	    System.out.println("===========================");
	    
        WeekDayData weekdata=new WeekDayData();
		
		System.out.println("\t\tFind One\t\t");
		WeekDay weekday=WeekDayData.findOne(1);
		System.out.println(weekday.toString());
		
		System.out.println("\n\t\tFind All\t\t\n");
		
		List<WeekDay> weekDay=WeekDayData.findAll();
		for(int i=0;i<weekDay.size();i++) {
			System.out.println(weekDay.get(i).toString());
			
		}
		
		System.out.println("\t\tSearch\t\t\n");
		
		weekDay=WeekDayData.search("Monday");
		for(int i=0;i<weekDay.size();i++) {
			System.out.println(weekDay.get(i).toString());
		}
		
		System.out.println("\t\tSave\t\t\n");
		weekday.setWEEKDAY_ID(6);
		weekday.setWEEKDAY_NAME("Saturday");
		weekday=WeekDayData.Save(weekday);
		System.out.println(weekday.toString());
		
	}
	
}
