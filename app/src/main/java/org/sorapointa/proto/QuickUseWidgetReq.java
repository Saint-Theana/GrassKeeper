package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetCameraInfo.*;
import org.sorapointa.proto.WidgetCameraInfo;
import org.sorapointa.proto.WidgetCreateLocationInfo.*;
import org.sorapointa.proto.WidgetCreateLocationInfo;
import org.sorapointa.proto.WidgetCreatorInfo.*;
import org.sorapointa.proto.WidgetCreatorInfo;
import org.sorapointa.proto.WidgetThunderBirdFeatherInfo.*;
import org.sorapointa.proto.WidgetThunderBirdFeatherInfo;

public class QuickUseWidgetReq {
    @Tag(tag=676) public WidgetCreateLocationInfo locationInfo = null;
    @Tag(tag=478) public WidgetCameraInfo cameraInfo = null;
    @Tag(tag=812) public WidgetCreatorInfo creatorInfo = null;
    @Tag(tag=1859) public WidgetThunderBirdFeatherInfo thunderBirdFeatherInfo = null;
}
