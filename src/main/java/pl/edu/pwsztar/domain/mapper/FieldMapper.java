package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.converter.Converter;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.domain.dto.FigurePositionDto;

@Component
public class FieldMapper implements Converter<FigureMoveDto, FigurePositionDto> {

    @Override
    public FigurePositionDto convert(FigureMoveDto from) {
        return new FigurePositionDto.Builder()
                .startXAxis(from.getStart().charAt(2))
                .startYAxis(from.getStart().charAt(0))
                .destinationXAxis(from.getDestination().charAt(2))
                .destinationYAxis(from.getDestination().charAt(0))
                .build();
    }
}