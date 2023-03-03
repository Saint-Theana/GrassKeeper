package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class DungeonEntryInfoReq {
    @Tag(tag=2) public Integer pointId = null;
    @Tag(tag=9) public Integer sceneId = null;
    @Tag(tag=4) public List<Uint32Pair> scenePointIdList = new ArrayList<>();
}
