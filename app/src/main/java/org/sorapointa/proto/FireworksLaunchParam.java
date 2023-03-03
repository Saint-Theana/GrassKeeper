package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksLaunchParamType.*;
import org.sorapointa.proto.FireworksLaunchParamType;

public class FireworksLaunchParam {
    @Tag(tag=5,isSigned=true) public Integer value = null;
    @Tag(tag=4) public Integer type = null;
}
