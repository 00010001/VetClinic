package pl.sdacademy.vetclinic.service;

import org.springframework.stereotype.Service;
import pl.sdacademy.vetclinic.model.*;
import pl.sdacademy.vetclinic.repository.AppointmentRepository;
import pl.sdacademy.vetclinic.repository.DoctorRepository;
import pl.sdacademy.vetclinic.repository.PetRepository;
import pl.sdacademy.vetclinic.repository.RoomRepository;

import javax.inject.Inject;

@Service
public class AppointmentService {
	@Inject
	private AppointmentRepository appointmentRepository;
	@Inject
	private PetRepository petRepository;
	@Inject
	private DoctorRepository doctorRepository;
	@Inject
	private RoomRepository roomRepository;

	public AppointmentComposite loadAppointmentData(Integer appointmentId) {
		Appointment appointment = appointmentRepository.getById(appointmentId);
		return loadAppointmentData(appointment);
	}

	public AppointmentComposite loadAppointmentData(Appointment appointment) {
		Pet examinatedPet = petRepository.getById(appointment.getPetId());
		Doctor consultant = doctorRepository.getById(appointment.getDoctorId());
		Room examinationRoom = roomRepository.getById(appointment.getRoomId());
		
		AppointmentComposite appointmentData = new AppointmentComposite(appointment);
		appointmentData.setPet(examinatedPet);
		appointmentData.setDoctor(consultant);
		appointmentData.setRoom(examinationRoom);
		return appointmentData;
	}

	public void setAppointmentRepository(AppointmentRepository appointmentRepo) {
		this.appointmentRepository = appointmentRepo;
	}

	public void setPetRepository(PetRepository petRepo) {
		this.petRepository = petRepo;
	}

	public void setDoctorRepository(DoctorRepository doctorRepo) {
		this.doctorRepository = doctorRepo;
	}

	public void setRoomRepository(RoomRepository roomRepo) {
		this.roomRepository = roomRepo;
	}
	
}
