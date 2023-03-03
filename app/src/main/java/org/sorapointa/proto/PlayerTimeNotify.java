package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerTimeNotify {
    @Tag(tag=5) public Long serverTime = null;
    @Tag(tag=11) public Long playerTime = null;
    @Tag(tag=14) public Boolean isPaused = null;
}
