package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerPreEnterMpNotify {
    public enum State {
        @Tag(tag=0) STATE_INVALID ,
        @Tag(tag=1) STATE_START ,
        @Tag(tag=2) STATE_TIMEOUT ;
    }

    @Tag(tag=2) public State state = null;
    @Tag(tag=14) public Integer uid = null;
    @Tag(tag=6) public String nickname = null;
}
