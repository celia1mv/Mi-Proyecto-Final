package proyecto.service.mapper;

import org.springframework.stereotype.Service;
import proyecto.data.entity.RoleEntity;
import proyecto.dto.RoleDTO;

@Service
public class RoleServiceMapper extends AbstractServiceMapper<RoleEntity, RoleDTO> {

    public RoleEntity toEntity(RoleDTO dto) {
        final RoleEntity entity = new RoleEntity();
        entity.setId(dto.getId());
        entity.setRoleName(dto.getRoleName());
        return entity;
    }

    public RoleDTO toDto(RoleEntity entity) {
        final RoleDTO dto = new RoleDTO();
        dto.setId(entity.getId());
        dto.setRoleName(entity.getRoleName());
        return dto;
    }
}
