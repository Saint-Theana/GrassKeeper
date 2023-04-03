package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksLaunchParam.*;
import org.sorapointa.proto.FireworksLaunchParam;

public class FireworksLaunchSchemeData {
    @Tag(tag=2) public Integer schemeId = null;
    @Tag(tag=13) public List<FireworksLaunchParam> launchParamList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> fireworksIdList = new ArrayList<>();
}
