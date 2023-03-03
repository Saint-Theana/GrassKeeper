package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionSaveDungeonResultReq {
    @Tag(tag=8) public Integer levelId = null;
    @Tag(tag=7) public Integer stageId = null;
}
