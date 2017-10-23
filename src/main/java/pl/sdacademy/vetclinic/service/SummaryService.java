package pl.sdacademy.vetclinic.service;

import org.springframework.stereotype.Service;
import pl.sdacademy.vetclinic.qualifier.HardDriveStorage;
import pl.sdacademy.vetclinic.repository.*;

import javax.inject.Inject;

@Service
public class SummaryService {

    @Inject
    private AppointmentRepository appointmentRepository;
    @Inject
    private DoctorRepository doctorRepository;
    @Inject
    private PetOwnerRepository petOwnerRepository;
    @Inject
    private PetRepository petRepository;
    @Inject
    private RoomRepository roomRepository;
    @HardDriveStorage
    @Inject
    private StaffRepository staffRepository;
    @Inject
    private AppointmentService appointmentService;

    public String getOverallSummary() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = stringBuilder.append("There are:\r\n")
                .append("\t").append(doctorRepository.count()).append(" doctors\r\n")
                .append("\t").append(staffRepository.count()).append(" other staff members\r\n")
                .append("\t").append(roomRepository.count()).append(" rooms\r\n")
                .append("\t").append(petOwnerRepository.count()).append(" pet owners\r\n")
                .append("\t").append(petRepository.count()).append(" pets\r\n")
                .append("\t").append(appointmentRepository.count()).append(" appointments\r\n");
        return stringBuilder.toString();
    }

    public void setAppointmentRepository(AppointmentRepository appointmentRepo) {
        this.appointmentRepository = appointmentRepo;
    }

    public void setDoctorRepository(DoctorRepository doctorRepo) {
        this.doctorRepository = doctorRepo;
    }

    public void setPetOwnerRepository(PetOwnerRepository petOwnerRepo) {
        this.petOwnerRepository = petOwnerRepo;
    }

    public void setPetRepository(PetRepository petRepo) {
        this.petRepository = petRepo;
    }

    public void setRoomRepository(RoomRepository roomRepo) {
        this.roomRepository = roomRepo;
    }

    public void setStaffRepository(StaffRepository staffRepo) {
        this.staffRepository = staffRepo;
    }

    public void setAppointmentService(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

}
