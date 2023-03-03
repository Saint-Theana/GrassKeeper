package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HostPlayerNotify {
    @Tag(tag=13) public Integer hostPeerId = null;
    @Tag(tag=10) public Integer hostUid = null;
}
