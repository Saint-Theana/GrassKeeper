package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBattleRecordMuipData.*;
import org.sorapointa.proto.CustomDungeonBattleRecordMuipData;

public class PlayerCustomDungeonMuipData {
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=2) public List<Long> publishDungeonList = new ArrayList<>();
    @Tag(tag=3) public List<Long> storeDungeonList = new ArrayList<>();
    @Tag(tag=4) public List<CustomDungeonBattleRecordMuipData> battleRecordList = new ArrayList<>();
}
