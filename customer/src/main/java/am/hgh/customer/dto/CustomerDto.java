package am.hgh.customer.dto;

import am.hgh.customer.entity.Machine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private Long id;
    private String customerName;

    @OneToMany
    private Set<Machine> customerMachine;
}
