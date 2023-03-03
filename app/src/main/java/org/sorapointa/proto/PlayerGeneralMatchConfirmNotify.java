package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerGeneralMatchConfirmNotify {
    @Tag(tag=8) public Integer matchId = null;
    @Tag(tag=13) public Boolean isAgree = null;
    @Tag(tag=14) public Integer uid = null;
}
