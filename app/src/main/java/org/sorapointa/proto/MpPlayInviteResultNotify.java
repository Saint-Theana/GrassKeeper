package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayInviteResultNotify {
    @Tag(tag=11) public Integer mpPlayId = null;
    @Tag(tag=10) public Boolean allAgree = null;
}
