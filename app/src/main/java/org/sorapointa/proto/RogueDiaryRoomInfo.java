package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class RogueDiaryRoomInfo {
    @Tag(tag=1) public List<Uint32Pair> monsterList = new ArrayList<>();
    @Tag(tag=3) public Boolean isBoss = null;
    @Tag(tag=7) public Integer configId = null;
}
