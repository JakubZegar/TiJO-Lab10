package pl.edu.pwsztar.service.chessServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.converter.Converter;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.domain.dto.FigurePositionDto;
import pl.edu.pwsztar.service.ChessService;

@Service
public class ChessServiceImpl implements ChessService {
    private final Converter<FigureMoveDto, FigurePositionDto> positionConverter;

    @Autowired
    public ChessServiceImpl(Converter<FigureMoveDto, FigurePositionDto> positionConverter) {
        this.positionConverter = positionConverter;
    }

    @Override
    public boolean checkMovePropriety(FigureMoveDto figureMoveDto) {
        FigurePositionDto figurePositionDto = positionConverter.convert(figureMoveDto);

        switch (figureMoveDto.getType()){
            case BISHOP:{
                if( Math.abs(figurePositionDto.getStartXAxis() - figurePositionDto.getDestinationXAxis())
                    == Math.abs(figurePositionDto.getStartYAxis() -  figurePositionDto.getDestinationYAxis()) ){
                    return true;
                } else {
                    return false;
                }
            }
            default:{
                return false;
            }
        }
    }
}
