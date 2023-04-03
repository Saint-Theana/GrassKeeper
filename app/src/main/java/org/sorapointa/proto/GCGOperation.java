package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpRedraw.*;
import org.sorapointa.proto.OpRedraw;
import org.sorapointa.proto.OpSelectOnStage.*;
import org.sorapointa.proto.OpSelectOnStage;
import org.sorapointa.proto.OpReroll.*;
import org.sorapointa.proto.OpReroll;
import org.sorapointa.proto.OpAttack.*;
import org.sorapointa.proto.OpAttack;
import org.sorapointa.proto.OpPass.*;
import org.sorapointa.proto.OpPass;
import org.sorapointa.proto.OpPlayCard.*;
import org.sorapointa.proto.OpPlayCard;
import org.sorapointa.proto.OpReboot.*;
import org.sorapointa.proto.OpReboot;
import org.sorapointa.proto.OpSurrender.*;
import org.sorapointa.proto.OpSurrender;

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
