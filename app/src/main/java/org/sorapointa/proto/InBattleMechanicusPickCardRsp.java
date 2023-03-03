package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusPickCardRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer cardId = null;
    @Tag(tag=4) public Integer playIndex = null;
    @Tag(tag=9) public Integer groupId = null;
}
