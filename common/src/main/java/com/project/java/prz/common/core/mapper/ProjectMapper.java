package com.project.java.prz.common.core.mapper;

import com.project.java.prz.common.core.domain.general.Project;
import com.project.java.prz.common.core.dto.ProjectDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by Piotr on 02.04.2017.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectMapper {

    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);

    ProjectDTO convertToDTO(Project project);

    Project convertToEntity(ProjectDTO projectDTO);

    List<ProjectDTO> convertToDTOs(List<Project> projects);

    List<Project> convertToEntities(List<ProjectDTO> projectDTOs);

}
