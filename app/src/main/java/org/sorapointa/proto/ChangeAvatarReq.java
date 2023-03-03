package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ChangeAvatarReq {
    @Tag(tag=15) public Vector movePos = null;
    @Tag(tag=2) public Integer skillId = null;
    @Tag(tag=7) public Long guid = null;
    @Tag(tag=10) public Boolean isMove = null;
}