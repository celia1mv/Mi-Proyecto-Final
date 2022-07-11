package proyecto.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractServiceMapper <E, DTO> {
    //a partir del param recibido E y del DTO declaro un obj publico, abst. que apartir del par. recibido en el primer elemento
    //me devuelve el tipo del primer elemento y en el segundo envia un dto

    public abstract E toEntity(DTO dto);

    public abstract DTO toDto(E e);

    //dame lista de entidades y me la devuelves a partir de lista de DTO
    //por defecto me devuelve un mappeo

    public List<E> toEntity(List<DTO> dtos) {
        return dtos.stream().map(this::toEntity).collect(Collectors.toList());
    }

    public List<DTO> toDto(List<E> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());

    }
}
