package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeModuleComfortInfo.*;
import org.sorapointa.proto.HomeModuleComfortInfo;

public class HomeComfortInfoNotify {
    @Tag(tag=6) public List<HomeModuleComfortInfo> moduleInfoList = new ArrayList<>();
}
