package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerRTTInfo {
    @Tag(tag=7) public Integer rtt = null;
    @Tag(tag=13) public Integer uid = null;
}
