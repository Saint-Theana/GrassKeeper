package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OtherCustomDungeonBrief.*;
import org.sorapointa.proto.OtherCustomDungeonBrief;

public class GetRecommendCustomDungeonRsp {
    @Tag(tag=8) public List<OtherCustomDungeonBrief> customDungeonList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
