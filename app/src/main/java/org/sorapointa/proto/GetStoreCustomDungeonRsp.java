package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OtherCustomDungeonBrief.*;
import org.sorapointa.proto.OtherCustomDungeonBrief;

public class GetStoreCustomDungeonRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public List<OtherCustomDungeonBrief> customDungeonList = new ArrayList<>();
}
