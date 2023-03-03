package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LunchBoxData.*;
import org.sorapointa.proto.LunchBoxData;

public class SetUpLunchBoxWidgetReq {
    @Tag(tag=6) public LunchBoxData lunchBoxData = null;
}
