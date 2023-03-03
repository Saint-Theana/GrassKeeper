package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RegionSimpleInfo {
    @Tag(tag=1) public String name = null;
    @Tag(tag=2) public String title = null;
    @Tag(tag=3) public String type = null;
    @Tag(tag=4) public String dispatchUrl = null;
}
