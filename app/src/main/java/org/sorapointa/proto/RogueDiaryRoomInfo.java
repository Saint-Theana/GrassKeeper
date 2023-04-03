package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class RogueDiaryRoomInfo {
    @Tag(tag=8) public List<Uint32Pair> monsterList = new ArrayList<>();
    @Tag(tag=4) public Boolean isBoss = null;
    @Tag(tag=14) public Integer configId = null;
}
