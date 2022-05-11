package am.hgh.customer.controller;

import am.hgh.customer.dto.CustomerDto;
import am.hgh.customer.dto.DeviceDto;
import am.hgh.customer.dto.MachineDto;
import am.hgh.customer.entity.Customer;
import am.hgh.customer.entity.Devices;
import am.hgh.customer.entity.Machine;
import am.hgh.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody CustomerDto customerDto) {
        Customer createdCustomer = customerService.createCustomer(customerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
    }
    @PostMapping("/{id}/machine")
    public ResponseEntity<Machine> createMachine(@RequestBody MachineDto machineDto) {
//      should be added logic in customerRepository or in different repo
        Machine createdMachine = customerService.createMachine(machineDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMachine);

    }

    @PostMapping("/device")
    public ResponseEntity<Devices> createDevice(@RequestBody DeviceDto deviceDto) {
// should be add the service/repo and the logic
        Devices createdDevices = customerService.createDevice(deviceDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMachine);

    }

}
