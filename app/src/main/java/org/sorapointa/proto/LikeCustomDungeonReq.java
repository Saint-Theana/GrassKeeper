package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LikeCustomDungeonReq {
    @Tag(tag=5) public Boolean isCancelLike = null;
    @Tag(tag=10) public Long dungeonGuid = null;
}
