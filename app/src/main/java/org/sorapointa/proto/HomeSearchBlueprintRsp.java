package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBlueprintSearchInfo.*;
import org.sorapointa.proto.HomeBlueprintSearchInfo;

public class HomeSearchBlueprintRsp {
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public HomeBlueprintSearchInfo searchInfo = null;
}
