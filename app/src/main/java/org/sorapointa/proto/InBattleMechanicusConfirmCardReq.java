package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusConfirmCardReq {
    @Tag(tag=6) public Integer playIndex = null;
    @Tag(tag=1) public Integer cardId = null;
    @Tag(tag=3) public Integer groupId = null;
}
