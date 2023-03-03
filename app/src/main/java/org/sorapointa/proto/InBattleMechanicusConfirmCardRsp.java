package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusConfirmCardRsp {
    @Tag(tag=2) public Integer playIndex = null;
    @Tag(tag=14) public Integer cardId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer groupId = null;
}
