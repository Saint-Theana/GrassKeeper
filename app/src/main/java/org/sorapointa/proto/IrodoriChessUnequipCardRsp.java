package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessUnequipCardRsp {
    @Tag(tag=10) public Boolean isHardMap = null;
    @Tag(tag=13) public Integer cardId = null;
    @Tag(tag=14) public Integer levelId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
