package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterFungusFighterTrainingDungeonRsp {
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer dungeonId = null;
}
