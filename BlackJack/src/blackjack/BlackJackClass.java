package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class BlackJackClass {

	public static void main(String[] args) {
		
		System.out.println("�Q�[�����J�n���܂��B");		
		
		//��̎R�D���쐬
		List<Integer>deck = new ArrayList<>(52);
		//�R�D���V���b�t��
		shuffleDeck(deck);
		 
        //�v���C���[�E�f�B�[���[�̎�D���X�g�𐶐�
        List<Integer>player = new ArrayList<>();
        List<Integer>dealer = new ArrayList<>();

        //�v���C���[�E�f�B�[���[���J�[�h��2������
        player.add(deck.get(0));
        player.add(deck.get(1));
        dealer.add(deck.get(2));
        dealer.add(deck.get(3));
        
        //�R�D�̐i�s�󋵂��L�^����ϐ�deckCount���`
        int deckCount = 4;
        
        //�v���C���[�̎�D�������L�^����ϐ�playerHands���`
        int playerHands = 2;


       //�v���C���[�E�f�B�[���[�̎�D�̃|�C���g��\��
        System.out.println("���Ȃ���1���ڂ̃J�[�h��" + toDescription(player.get(0)));
        System.out.println("�f�B�[���[��1���ڂ̃J�[�h��" + toDescription(dealer.get(0)));
        System.out.println("���Ȃ���2���߂̃J�[�h��" + toDescription(player.get(1)));
        System.out.println("�f�B�[���[��2���߂̃J�[�h�͔閧�ł��B");

        //�v���C���[�E�f�B�[���[�̃|�C���g���W�v
        int playerPoint = sumPoint(player);
        int dealerPoint = sumPoint(dealer);
        
        System.out.println("���Ȃ��̌��݂̃|�C���g��" + playerPoint + "�ł��B" );


        //�v���C���[���J�[�h�������t�F�[�Y
        while(true) {
        	System.out.println("�J�[�h�������܂����HYES:y or NO:n");
        	
        	//�L�[�{�[�h����
        	Scanner scan = new Scanner(System.in);
        	String str = scan.next();
        	
        	if("n".equals(str)){
        		break;
        	}else if("y".equals(str)) {
        		//��D�̒ǉ��ƃo�[�X�g�̃`�F�b�N
        		player.add(deck.get(deckCount));
        		
        		//�R�D�Ǝ�D��1���i�߂�
        		deckCount ++;
        		playerHands ++;
        		
        		System.out.println("���Ȃ���" + playerHands +"���ڂ̃J�[�h��"+ toDescription(player.get(0)));
        		playerPoint = sumPoint(player);
        		System.out.println("���݂̍��v��:"+playerPoint);
        		
        		//�v���C���[�̃o�[�X�g�`�F�b�N
        		if(isBusted(playerPoint)) {
        			System.out.println("�c�O�A�o�[�X�g���Ă��܂��܂���");
        			return; //System.in�Ɋւ��Ă̓N���[�X���Ȃ��B�˃L�[�{�[�h�̓��͂��ł��Ȃ��Ȃ��Ă��܂��B
        		}
        		
        	}else {
        		System.out.println("���Ȃ��̓��͂�" + str +"�ł��By��n����͂��Ă��������B");
        	}
        }
        
        //�f�B�[���[����D��17�ȏ�ɂ���܂ŃJ�[�h�������t�F�[�Y
        while(true) {
        	//��D��17�ȏ�̏ꍇ�A�u���[�N
        	if(dealerPoint >= 17) {
        		break;
        	}else {
        		//��D����1��������
        		dealer.add(deck.get(deckCount));
        		//�R�D��1�i�߂�
        		deckCount ++;
        		
        		//�f�B�[���[�̍��v�|�C���g�v�Z
        		dealerPoint = sumPoint(dealer);
        		
        		//�f�B�[���[�̃o�[�X�g�`�F�b�N
        		if(isBusted(dealerPoint)) {
        			System.out.println("�f�B�[���[���o�[�X�g���܂����B���Ȃ��̏����ł��B");
        		}
        	}
        	
        }      
        
        //�|�C���g���r����
        System.out.println("���Ȃ��̃|�C���g��" + playerPoint);
        System.out.println("�f�B�[���[�̃|�C���g��"+ dealerPoint);
        
        if(playerPoint == dealerPoint) {
        	System.out.println("���������ł��B");
        }else if(playerPoint > dealerPoint){
        	System.out.println("�����܂����I");
        }else {
        System.out.println("�����܂����E�E�E");
        }

	}
	
	
	//�R�D(deck)�ɒl�����A�V���b�t�����郁�\�b�h
	private static void shuffleDeck(List<Integer>deck) {
		
		//���X�g�ɂP�`�T�Q�̘A�Ԃ���
		for(int i = 1;i <= 52;i++) {
			deck.add(i);
		}
		//�R�D�V���b�t��
		Collections.shuffle(deck);
		
		/*
		 * //���X�g�̒��g���m�F(�f�o�b�O�p) for(int i=0; i<deck.size(); i++) {
		 * System.out.println(deck.get(i)); }
		 */
		
	}
	
	//��D���o�[�X�g���Ă��邩���肷�郁�\�b�h
	private static boolean isBusted(int point) {
		if(point >= 21) {
			return true;
		}
		return false;
		
	}
	
	//���݂̍��v�|�C���g���v�Z���郁�\�b�h 
	private static int sumPoint(List<Integer>list) {
		int sum = 0;
		
		for(int i=0;i<list.size();i++) {
			sum = sum + toPoint(toNumber(list.get(i)));
		}
		return sum;
	}
	
	//�R�D�̒ʂ��ԍ��𓾓_�v�Z�p�̃|�C���g�ɕϊ����郁�\�b�h�BJ/Q/K��10�Ƃ���B
	private static int toPoint(int num) {
		if(num >= 10) {
			num = 10;
		}
		return num;
	}
	
	//�R�D�̐����i�X�[�g�j�́i�����N�j�̕�����ɒu�������郁�\�b�h
	private static String toDescription(int cardNumber) {
		String rank = toRank(toNumber(cardNumber));
		String suit = toSuit(cardNumber);
		
		return suit + "��" + rank;
	}
	
	//�R�D�̐����J�[�h�̐��ɒu�������郁�\�b�h
	private static int toNumber(int cardNumber) {
		int number = cardNumber % 13;
		if(number == 0) {
			number = 13;
		}
		return number;
	}
	
	//�J�[�h�̔ԍ��̃����N�iA��J,Q,K)�ɕϊ����郁�\�b�h
	private static String toRank(int number) {
		switch(number) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			String str = String.valueOf(number);
			return str;
		}
	}
	
	//�R�D�̐����X�[�g�i�n�[�g��X�y�[�h�Ȃǂ̃}�[�N�j�ɒu�������郁�\�b�h
	private static String toSuit(int cardNumber) {
		switch((cardNumber-1)/13) {
		case 0:
			return "�N���u";
		case 1:
			return "�_�C��";
		case 2:
			return "�n�[�g";
		case 3:
			return "�X�y�[�h";
		default:
			return "��O�ł�";
		}
	}
}
