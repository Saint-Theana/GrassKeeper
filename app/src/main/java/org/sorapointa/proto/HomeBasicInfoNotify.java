package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBasicInfo.*;
import org.sorapointa.proto.HomeBasicInfo;

public class HomeBasicInfoNotify {
    @Tag(tag=15) public HomeBasicInfo basicInfo = null;
}
