package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FireworksLaunchParam {
    @Tag(tag=5) public Integer type = null;
    @Tag(tag=14,isSigned=true) public Integer value = null;
}
