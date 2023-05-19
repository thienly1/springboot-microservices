package net.javamicro.organizationservice.service;

import lombok.AllArgsConstructor;
import net.javamicro.organizationservice.dto.OrganizationDto;
import net.javamicro.organizationservice.entity.Organization;
import net.javamicro.organizationservice.mapper.OrganizationMapper;
import net.javamicro.organizationservice.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService{
    private OrganizationRepository organizationRepository;
    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization= OrganizationMapper.mapToOrganization(organizationDto);
        Organization saveOrganization = organizationRepository.save(organization);
        OrganizationDto organizationDto1= OrganizationMapper.mapToOrganizationDto(saveOrganization);
        return organizationDto1;
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization= organizationRepository.findByOrganizationCode(organizationCode);
        OrganizationDto organizationDto= OrganizationMapper.mapToOrganizationDto(organization);
        return organizationDto;
    }

}
