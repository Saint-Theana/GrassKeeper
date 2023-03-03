package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StopServerInfo {
    @Tag(tag=1) public Integer stopBeginTime = null;
    @Tag(tag=2) public Integer stopEndTime = null;
    @Tag(tag=3) public String url = null;
    @Tag(tag=4) public String contentMsg = null;
}
