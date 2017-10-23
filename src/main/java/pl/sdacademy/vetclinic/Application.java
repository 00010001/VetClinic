package pl.sdacademy.vetclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.sdacademy.vetclinic.repository.AppointmentRepository;
import pl.sdacademy.vetclinic.repository.DoctorRepository;
import pl.sdacademy.vetclinic.repository.PetOwnerRepository;
import pl.sdacademy.vetclinic.repository.PetRepository;
import pl.sdacademy.vetclinic.repository.RoomRepository;
import pl.sdacademy.vetclinic.repository.StaffRepository;
import pl.sdacademy.vetclinic.repository.impl.DefaultAppointmentRepository;
import pl.sdacademy.vetclinic.repository.impl.DefaultDoctorRepository;
import pl.sdacademy.vetclinic.repository.impl.DefaultPetOwnerRepository;
import pl.sdacademy.vetclinic.repository.impl.DefaultPetRepository;
import pl.sdacademy.vetclinic.repository.impl.DefaultRoomRepository;
import pl.sdacademy.vetclinic.repository.impl.DefaultStaffRepository;
import pl.sdacademy.vetclinic.service.AppointmentService;
import pl.sdacademy.vetclinic.service.SummaryService;

import javax.inject.Inject;

@Component
public class Application {
    @Inject
	private AppointmentService appointmentService;
    @Inject
	private SummaryService summaryService;

    public void printGeneralSummary() {
        System.out.println(summaryService.getOverallSummary());
    }

    public void setAppointmentService(AppointmentService appointmentService) {
		this.appointmentService = appointmentService;
	}

	public void setSummaryService(SummaryService summaryService) {
		this.summaryService = summaryService;
	}


}
