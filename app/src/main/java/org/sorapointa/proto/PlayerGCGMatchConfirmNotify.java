package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerGCGMatchConfirmNotify {
    @Tag(tag=10) public Integer uid = null;
    @Tag(tag=5) public Boolean isAgree = null;
    @Tag(tag=14) public Integer matchId = null;
}
