package am.hgh.customer.dto;

import am.hgh.customer.entity.Devices;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ManyToOne;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MachineDto {
    private Long id;
    private String machineName;
    @ManyToOne
    private Devices devices;
}
