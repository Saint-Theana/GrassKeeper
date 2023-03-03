package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LunchBoxData.*;
import org.sorapointa.proto.LunchBoxData;

public class SetUpLunchBoxWidgetRsp {
    @Tag(tag=3) public LunchBoxData lunchBoxData = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
