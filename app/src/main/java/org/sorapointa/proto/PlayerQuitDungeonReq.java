package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerQuitDungeonReq {
    @Tag(tag=10) public Boolean isQuitImmediately = null;
    @Tag(tag=7) public Integer pointId = null;
}
