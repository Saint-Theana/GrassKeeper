package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGOperation {
    @Tag(tag=12) public OpRedraw opRedraw = null;
    @Tag(tag=4) public OpSelectOnStage opSelectOnStage = null;
    @Tag(tag=13) public OpReroll opReroll = null;
    @Tag(tag=9) public OpAttack opAttack = null;
    @Tag(tag=10) public OpPass opPass = null;
    @Tag(tag=8) public OpPlayCard opPlayCard = null;
    @Tag(tag=6) public OpReboot opReboot = null;
    @Tag(tag=15) public OpSurrender opSurrender = null;
}
