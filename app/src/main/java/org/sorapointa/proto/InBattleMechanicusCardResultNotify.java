package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InBattleMechanicusCardInfo.*;
import org.sorapointa.proto.InBattleMechanicusCardInfo;

public class InBattleMechanicusCardResultNotify {
    public static class MapPlayerConfirmedCardMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public Integer waitSeconds = null;
    @Tag(tag=2) public Integer groupId = null;
    @Tag(tag=9) public List<InBattleMechanicusCardInfo> cardList = new ArrayList<>();
    @Tag(tag=7) public Long waitBeginTimeUs = null;
    @Tag(tag=12) public List<MapPlayerConfirmedCardMap> playerConfirmedCardMap = new ArrayList<>();
    @Tag(tag=8) public Integer playIndex = null;
}
