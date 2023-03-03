package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetCoolDownData.*;
import org.sorapointa.proto.WidgetCoolDownData;
import org.sorapointa.proto.WidgetExtraCdType.*;
import org.sorapointa.proto.WidgetExtraCdType;

public class WidgetUpdateExtraCDRsp {
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer materialId = null;
    @Tag(tag=6) public Integer extraCdType = null;
    @Tag(tag=10) public WidgetCoolDownData coolData = null;
    @Tag(tag=15) public Integer cdGroup = null;
}
