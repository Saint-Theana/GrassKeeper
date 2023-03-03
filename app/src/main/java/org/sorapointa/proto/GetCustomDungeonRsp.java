package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBanInfo.*;
import org.sorapointa.proto.CustomDungeonBanInfo;
import org.sorapointa.proto.CustomDungeonBrief.*;
import org.sorapointa.proto.CustomDungeonBrief;

public class GetCustomDungeonRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public CustomDungeonBanInfo banInfo = null;
    @Tag(tag=5) public List<CustomDungeonBrief> briefList = new ArrayList<>();
}
