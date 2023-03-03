package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeGameTimeReq {
    @Tag(tag=6) public Integer gameTime = null;
    @Tag(tag=11) public Boolean isForceSet = null;
    @Tag(tag=12) public Integer extraDays = null;
}
