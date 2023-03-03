package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetExtraCdType.*;
import org.sorapointa.proto.WidgetExtraCdType;

public class WidgetUpdateExtraCDReq {
    @Tag(tag=14) public Integer materialId = null;
    @Tag(tag=10) public Integer extraCdType = null;
    @Tag(tag=7) public Integer cdGroup = null;
}
